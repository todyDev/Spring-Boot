<template>
    <content>
        <h4>BOARD-WRITE</h4>

        <div class="poster-write">
            <b-form @submit.prevent="boardSubmit" method="post">
                <b-form-group>
                    <b-form-checkbox size="sm" class="text-left" v-model="selectedNotice" switch>공지사항 설정</b-form-checkbox>
                </b-form-group>
                <b-form-group>
                    <b-form-input type="text" placeholder="제목을 입력하세요." v-model="title"/>
                </b-form-group>
                <b-form-group>
                    <b-form-input type="text" placeholder="작성자를 입력하세요." v-model="writer"/>
                </b-form-group>
                <b-form-group>
                    <vue-editor :editorToolbar="customEditorTool" id="customVueEditor" v-model="content"></vue-editor>
                </b-form-group>
                <b-form-group label="공개설정 범위:" class="text-left">
                    <b-form-radio-group
                        v-model="selectedOpenRange"
                        :options="openRangeOptions"
                    ></b-form-radio-group>
                </b-form-group>
                <b-form-group label="댓글 설정:" class="text-left">
                    <b-form-radio-group
                        v-model="selectedReplyAccept"
                        :options="replyAcceptOptions"
                    ></b-form-radio-group>
                </b-form-group>
                <b-button type="submit" variant="primary" v-bind:disabled="this.title == '' || this.content == '' || this.writer == ''">작성</b-button>
                <b-button type="button" variant="secondary" @click="boardCancel">취소</b-button>
            </b-form>
        </div>
    </content>
</template>
<style>
.poster-write {
    padding: 30px 120px 30px 120px;
}
#customVueEditor .ql-editor {
    min-height: 500px;
}
</style>
<script type="text/javascrpit">
/* eslint-disable */
import { VueEditor } from "vue2-editor";
export default {
    components : {
        VueEditor
    },
    data() {
        return {
            title: '',
            writer: '',
            content: '',
            selectedOpenRange: 'A',
            selectedReplyAccept: 'Y',
            selectedNotice: false,
            openRangeOptions: [
                {text:'전체공개',value:'A'},
                {text:'멤버공개',value:'M'},
                {text:'비공개',value:'S'}
            ],
            replyAcceptOptions: [
                {text:'댓글 허용',value:'Y'},
                {text:'댓글 비허용',value:'N'}
            ],
            customEditorTool: [
                ["bold", "italic", "underline","strike"],
                [{align:""},{align:"center"},{align:"right"},{align:"justify"}],
                [{ list: "ordered"},{list:"bullet"},{list:"check"}],
                [{indent:"-1"},{indent:"+1"}],
                [{"color":[]},{"background":[]}],
                ["blockquote","code-block","link"]
            ]
        }
    },
    methods: {
        boardSubmit() {
            var boardData = {
                title: this.title,
                writer: this.writer,
                content: this.content,
                notice: this.selectedNotice ? 'Y' : 'N',
                open: this.selectedOpenRange,
                reply: this.selectedReplyAccept
            }

            this.$axios.post('/api/postBoard', boardData)
            .then((resp)=>{
                console.info(resp)
                alert('글이 등록되었습니다.')
            })
            .catch((error)=>{
                console.warn("post error :::: ",error)
                alert('글쓰기에 실패했습니다.')
            })

            this.$router.push({
                path: '/board/boardList'
            })
        },
        boardCancel() {
            this.$router.go(-1)
        }
    },
    created() {
        var boardIndex = {
            index: this.$route.params.boardIdx
        }
        this.$axios.get('/api/getBoardModify', {
            params: boardIndex
        })
        .then((resp)=>{
            console.info(resp)
            this.idx = resp.data.idx
            this.title = resp.data.title
            this.writer = resp.data.writer
            this.content = resp.data.content
            this.selectedNotice = resp.data.notice
            this.selectedOpenRange = resp.data.open
            this.selectedReplyAccept = resp.data.reply
        })
        .catch((error)=>{
            console.warn(error)
        })
    }
}
/* eslint-disable */
</script>
