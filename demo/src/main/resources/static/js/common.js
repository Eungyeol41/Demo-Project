function marginStyle(div, num) {
    let marginDiv;

    if (div === 't') {
        marginDiv = 'top';
    } else if (div === 'r') {
        marginDiv = 'right';
    } else if (div === 'b') {
        marginDiv = 'bottom';
    } else if (div === 'l') {
        marginDiv = 'left';
    } else {
        marginDiv = '';
    }

    $(this).css('margin-' + marginDiv, num);
}