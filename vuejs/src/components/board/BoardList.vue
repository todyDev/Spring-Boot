<template>
    <content>
        <h4>BOARD-LIST</h4>

        <b-table-simple caption-top class="col-md-10 text-left" align="center">
            <caption>
                <b-button size="sm" variant="outline-secondary" class="btn-write">글작성</b-button>
                <b-form-select size="sm" :value="10" :options="pageOfNumberOptions" class="btn-page-of-number">
                <template v-slot:first>
                    <option :value="10">10개씩</option>
                </template>
                </b-form-select>
                <b-form-checkbox size="sm" class="btn-notice-hide" switch>공지 숨기기</b-form-checkbox>
            </caption>
            <b-thead>
                <b-tr>
                    <b-th>idx</b-th>
                    <b-th>title</b-th>
                    <b-th>writer</b-th>
                    <b-th>date</b-th>
                    <b-th>view</b-th>
                </b-tr>
            </b-thead>
            <b-tbody>
                <b-tr v-for="board in items" :key="board.BOARD_IDX" >
                    <b-td>{{board.BOARD_IDX}}</b-td>
                    <b-td width="50%" style="cursor:pointer;">{{board.TITLE}}</b-td>
                    <b-td>{{board.WRITER}}</b-td>
                    <b-td>{{board.LIKE}}</b-td>
                    <b-td>{{board.VIEW}}</b-td>
                </b-tr>
            </b-tbody>
        </b-table-simple>

        <b-alert show variant="light" v-if="items.length == 0">게시글이 존재하지 않습니다.</b-alert>

        <b-pagination-nav pills :link-gen="linkGen" align="center" use-router></b-pagination-nav>

        <div class="search">
            <b-form inline>
                <label class="mr-sm-2">게시글 전체 검색</label>
                <b-form-select class="mr-sm-2" :options="searchOptions" size="sm">
                    <template v-slot:first>
                        <option :value="all">전체</option>
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
.btn-page-of-number {
    float:right;
    width:10%;
    margin-left:10px;
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
        pageOfNumberOptions:[
            {value:'15', text:'15개씩'},
            {value:'20', text:'20개씩'},
            {value:'50', text:'50개씩'},
            {value:'100', text:'100개씩'}
        ],
        items: []
      }
    },
    created() {
        this.$http.get('/api/getBoardList').then((resp)=>{
            this.items = resp.data
        })
    }
}
/* eslint-disable */
</script>
