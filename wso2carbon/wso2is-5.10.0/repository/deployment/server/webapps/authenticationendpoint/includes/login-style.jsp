<style>
    .ui.icon.input>i.icon:not(.link){
        pointer-events: all;
    }
    /* align Items in login form */
    #loginForm > .stackable{
        justify-content: center;
    }

    #loginForm > .stackable button[type='submit']{
        flex: 1;
        -webkit-box-shadow: 3px 3px 3px 3px rgba(45, 45, 45, 0.1);
        -moz-box-shadow:    3px 3px 3px 3px rgba(45, 45, 45, 0.1);
        box-shadow:         3px 3px 3px 3px rgba(45, 45, 45, 0.1);
    }

    /* style for forgotPassword text */
    #passwordRecoverLink{
        color: blue;
        text-decoration: underline;
        font-size: 14px;
    }

    /*    style for header text */
    .right-segment{
        display: flex;
        justify-content: flex-end;
        margin-right: 50px;
        margin-top: 20px;
    }
    .right-segment a{
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-size: 14px;
        text-decoration: underline;
        color: blue
    }
</style>
