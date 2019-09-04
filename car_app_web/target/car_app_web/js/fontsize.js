
$(function () {
    function setRem() {
        let clientWidth = $(window).width();
        let nowRem = (clientWidth /750 * 100);
        $("html").css("font-size", parseInt(nowRem, 10) + "px");
    }

    setRem();

    $(function () {
        let timer;
        $(window).bind("resize", function () {
            clearTimeout(timer);
            timer = setTimeout(function () {
                setRem();
            }, 100)
        })
    });
});