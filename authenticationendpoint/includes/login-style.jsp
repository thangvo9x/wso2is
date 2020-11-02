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

    .ui.header{
        margin: 50px auto 30px;
    }

    /* style for forgotPassword text */
    #passwordRecoverLink{
        color: blue;
        text-decoration: underline;
        font-size: 14px;
    }

    /*    style for header text */
    .language{
        position: absolute;
        top: 15px;
        right: 15px;
    }
    .language a{
        cursor: pointer;
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-size: 18px;
        text-decoration: underline;
        color: blue
    }

</style>
