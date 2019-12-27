<template>
    <content>
        <h4>BOARD-LIST</h4>

        <b-table-simple caption-top class="col-md-10 text-left" align="center">
            <caption>
                <b-button size="sm" variant="outline-secondary" class="btn-write" @click="goToWritePage">글작성</b-button>
                <b-form inline class="float-right">
                    <b-form-select size="sm"
                        v-model="selectedPageOfNumber"
                        :options="pageOfNumberOptions"
                    ></b-form-select>
                </b-form>
                <b-form-checkbox size="sm" class="btn-notice-hide" switch>공지 숨기기</b-form-checkbox>
            </caption>
            <b-thead>
                <b-tr>
                    <b-th>글번호</b-th>
                    <b-th>제목</b-th>
                    <b-th>작성자</b-th>
                    <b-th>작성일</b-th>
                    <b-th>조회수</b-th>
                </b-tr>
            </b-thead>
            <b-tbody>
                <b-tr v-for="board in items" :key="board.IDX" >
                    <b-td>{{board.IDX}}</b-td>
                    <b-td width="50%" style="cursor:pointer;" @click="goToContent(board.IDX)">{{board.TITLE}}</b-td>
                    <b-td>{{board.WRITER}}</b-td>
                    <b-td>{{board.CREA_DATE}}</b-td>
                    <b-td>{{board.VIEW}}</b-td>
                </b-tr>
            </b-tbody>
        </b-table-simple>

        <b-alert show variant="light" v-if="items && items.length == 0">게시글이 존재하지 않습니다.</b-alert>

        <b-pagination pills align="center"
            v-model="currentPage"
            :total-rows="itemsTotalRows"
            :per-page="selectedPageOfNumber"
        ></b-pagination>

        <div class="search">
            <b-form inline>
                <label class="mr-sm-2">게시글 전체 검색</label>
                <b-form-select class="mr-sm-2" :options="searchOptions" size="sm">
                    <template v-slot:first>
                        <option :value="null">전체</option>
                    </template>
                </b-form-select>
                <b-form-input class="mr-sm-2" size="sm"></b-form-input>
                <b-button size="sm">검색</b-button>
            </b-form>
        </div>

    </content>
</template>

<style>
.search {
    display: inline-block;
    margin: 15px;
}
.btn-write {
    float:left;
}
.btn-notice-hide {
    float:right;
    top:6px;
}
</style>

<script>
/* eslint-disable */
export default {
    data() {
      return {
        searchOptions:[
            {value: 'title_content', text: '제목+내용'},
            {value: 'title', text: '제목'},
            {value: 'content', text: '내용'},
            {value: 'writer', text: '작성자'}
        ],
        selectedPageOfNumber: 10,
        pageOfNumberOptions:[
            {value:10, text:'10개씩'},
            {value:15, text:'15개씩'},
            {value:20, text:'20개씩'},
            {value:50, text:'50개씩'},
            {value:100, text:'100개씩'}
        ],
        items: null,
        resultBoard: null,
        currentPage: 1,
        itemsTotalRows: 0
      }
    },
    created() {
        this.$axios.get('/api/getBoardList').then((resp)=>{
            this.resultBoard = resp.data
            this.itemsTotalRows = _.size(this.resultBoard)
            this.selectedItemList()
        })
    },
    methods: {
        goToWritePage() {
            this.$router.push({
                name: 'BOARD-WRITE-PAGE'
            })
        },
        goToContent(index) {
            this.$router.push({
                name: 'BOARD-DETAIL-PAGE',
                params: {
                    boardIdx: index
                }
            })
        },
        selectedItemList() {
            this.items = _.chunk(this.resultBoard, this.selectedPageOfNumber)[this.currentPage-1]
        }

    },
    watch: {
        selectedPageOfNumber: function(){
            this.selectedItemList()
        },
        currentPage: function(){
            this.selectedItemList()
        }
    }
}
/* eslint-disable */
</script>
