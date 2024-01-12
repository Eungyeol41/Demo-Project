function marginStyle(div, num) {
    let marginDiv;

    switch (div) {
        case 't' :
            marginDiv = '-top';
            break
        case 'r' :
            marginDiv = '-right';
            break
        case 'b' :
            marginDiv = '-bottom';
            break
        case 'l' :
            marginDiv = '-left';
            break
        default :
            marginDiv = '';
            break
    }

    $(this).css('margin' + marginDiv, num);
}