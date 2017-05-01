<style>
</style>
<template>
    <div class="row">
        <h4>Print Hello World Message !!</h4>
        <a class="waves-effect waves-light btn red" @click="printMessage()">Print Message</a>
        <blockquote>{{ message }}</blockquote>
    </div>
</template>
<script>
    import Hello from '../../domain/Hello';
    export default {
        created() {
            this.domain = new Hello();
        },
        data() {
            return {
                message: ""
            }
        },
        methods: {
            printMessage() {
                console.log("Hello.vue printMessage()");
                this.message = this.domain.printHello();
            }
        }
    }
</script>