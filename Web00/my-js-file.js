const list = document.createElement('ul');
const info = document.createElement('p');
const html = document.querySelector('html');

info.textContent = '以下是一个动态列表。点击列表外任意位置可添加新的列表项。点击已有的列表项可修改内容。';

document.body.appendChild(info);
document.body.appendChild(list);

html.onclick = function () {
    const listItem = document.createElement('li');
    listItem.textContent = prompt('希望列表中显示什么内容？');
    list.appendChild(listItem);

    listItem.onclick = function (e) {
        e.stopPropagation();
        this.textContent = prompt('为列表项输入新的内容');
    };
};
