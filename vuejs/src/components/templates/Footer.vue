<template>
    <footer>
        <b-container class="footer">
            <b-navbar>
                <b-nav-text><b>© 2019 todyDev, Inc.</b></b-nav-text>
                <b-navbar-nav>
                    <b-nav-item class="mr-1">Terms</b-nav-item>
                    <b-nav-item class="mr-1">Privacy</b-nav-item>
                    <b-nav-item class="mr-1">Security</b-nav-item>
                    <b-nav-item class="mr-1">Status</b-nav-item>
                    <b-nav-item class="mr-1">Help</b-nav-item>
                </b-navbar-nav>
                <b-link :to="'/'" class="d-none d-lg-block ml-auto text-muted"><font-awesome-icon icon="feather-alt" /></b-link>
                <b-navbar-nav class="ml-auto">
                    <b-nav-item class="mr-1">Contact todyDev</b-nav-item>
                    <b-nav-item class="mr-1">Pricing</b-nav-item>
                    <b-nav-item class="mr-1">API</b-nav-item>
                    <b-nav-item class="mr-1">Training</b-nav-item>
                    <b-nav-item class="mr-1">Blog</b-nav-item>
                    <b-nav-item class="mr-1">About</b-nav-item>
                </b-navbar-nav>
            </b-navbar>
        </b-container>
    </footer>
</template>

<script>
import { library } from '@fortawesome/fontawesome-svg-core'
import { faFeatherAlt } from '@fortawesome/free-solid-svg-icons'
library.add(faFeatherAlt)

export default {
    
}
</script>

<style scoped>
.footer {
    padding-top: 10px;
    padding-bottom: 30px;
    border-top: 1px solid #e5e5e5;
    font-size: 12px;
}
.item-style {
    padding: initial;
    border: 0;
    width: initial;
}
</style>
