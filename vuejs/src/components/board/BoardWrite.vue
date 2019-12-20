<template>
    <content>
        <h4>BOARD-WRITE</h4>

        <div class="poster-write">
            <b-form>
                <b-form-group>
                    <b-form-checkbox size="sm" class="text-left" switch>공지사항 설정</b-form-checkbox>
                </b-form-group>
                <b-form-group>
                    <b-form-input type="text" placeholder="제목을 입력하세요."/>
                </b-form-group>
                <b-form-group>
                    <b-form-input type="text" placeholder="작성자를 입력하세요."/>
                </b-form-group>
                <b-form-group>
                    <vue-editor :editorToolbar="customEditorTool" id="customVueEditor"></vue-editor>
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
                <b-button type="submit" variant="primary">작성</b-button>
                <b-button type="button" variant="secondary">취소</b-button>
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
            selectedNotice: false,
            openRangeOptions: [
                {text:'전체공개',value:'A'},
                {text:'멤버공개',value:'M'},
                {text:'비공개',value:'S'}
            ],
            selectedReplyAccept: 'Y',
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
    }
}
/* eslint-disable */
</script>
