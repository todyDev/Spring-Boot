<template>
    <content>
        <div class="poster">
            <div class="post-box">
                <h2 class="post-title">{{title}}</h2>
                <div class="post-meta">
                    {{date}} by <b>{{writer}}</b> | view {{view}}
                    <ul class="list-unstyled" style="margin-top:10px;">
                        <li class="d-inline"><b-button size="sm" pill variant="outline-secondary">수정</b-button></li>
                        <li class="d-inline"><b-button size="sm" pill variant="outline-secondary">삭제</b-button></li>
                    </ul>
                </div>
                <div v-html="content" class="post-content"></div>
                <p class="post-content"> 삭제할 부분들 Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
            </div>
            <div class="post-etc-box">
                <ul class="list-unstyled">
                    <li class="post-etc"><b-link href="#"><font-awesome-icon icon="share-alt" /> Share</b-link></li>
                    <li class="post-etc"><b-link href="#"><font-awesome-icon icon="heart" /> Like {{like}}</b-link></li>
                </ul>
            </div>
        </div>
    </content>
</template>

<style scoped>
.post-etc-box {
    padding: 15px 30px 15px 30px;
    border-bottom: 1px solid #eee;
    font-size: 14px;
}
.post-etc-box ul {
    margin: 0;
}
.post-etc {
    display: inline;
    margin-right: 10px;
}
.post-etc > a {
    color:dimgrey;
    text-decoration:none;
}
.poster {
    margin: 40px 60px 50px 60px;
    text-align: left;
}
.post-box {
    padding: 20px 20px 30px 20px;
    border-bottom: 1px solid #eee;
}
.post-title {
    font-weight: bold;
}
.post-meta {
    color: #999;
}
.post-content {
    margin: 40px 3px 10px 3px;
}
</style>

<script>
/* eslint-disable */
export default {
    data() {
        return {
            title: '',
            writer: '',
            content: '',
            view: '',
            like: '',
            date: ''
        }
    },
    created() {
        var boardIndex = {
            index: this.$route.params.boardIdx
        }
        this.$axios.get('/api/getBoardDetail', {
            params: boardIndex
        })
        .then((resp)=>{
            console.info(resp)
            this.title = resp.data.title
            this.writer = resp.data.writer
            this.content = resp.data.content
            this.view = resp.data.view
            this.like = resp.data.like_cnt
            this.date = resp.data.crea_date
        })
        .catch((error)=>{
            console.warn(error)
        })
    }
}
/* eslint-disable */
</script>
