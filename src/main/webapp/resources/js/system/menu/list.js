
/**
 * bootstrap table
 */

var $table = $('#table'),
    $removeBtn = $('#remove');

$table.bootstrapTable({
    // 表格高度
    height: 600,
    // 表格的样式类，可自定义表格样式
    classes: 'table table-hover table-striped',
    // 当单元格数据不存在时显示的内容
    undefinedText: '/',
    // 单元行隔行变色，与class='table-striped'效果一致
    striped: true,
    // 工具栏
    toolbar: $('#toolbar'),

    // 向服务器请求表格数据的地址
    url: 'list.htm',
    // 向服务器请求表格数据的方法
    method: 'get',
    // 接收服务器返回的表格数据的格式
    dataType: 'json',
    // 在表格加载数据之前对从服务器接收的数据进行处理，res为接收到的数据
    responseHandler: function(res) {
         // console.log(res);
        return res;
    },
    // 是否禁用Ajax缓存
    cache: true,

    // 分页条
    pagination: true,
    // 首页页码
    // pageNumber: 1,
    // 页面数据条数
    // pageSize: 10,
    // 选择页面数据 条数
    pageList: [5, 10, 15, 20],

    // 是否启用搜索框
    search: true,
    // 按下enter时是否自动触发搜索
    searchOnEnterKey: true,
    // 是否全匹配搜索，否则为模糊搜索
    strictSearch: false,
    // 搜索超时时间
    searchTimeout: 10000,

    // 是否显示列头
    showHeader: true,
    // 是否显示列脚
    showFooter: false,
    // 是否显示选择显示列下拉框
    showColumns: true,
    // 是否显示刷新按钮
    showRefresh: true,
    showToggle: true,

    // 单击行时自动选择radiobox和checkbox
    clickToSelect: true,
    // 是否记录选中项
    maintainSelected: true,

    // 单元列信息的详细配置
    columns: [{
        checkbox: true
    },{
        // 字段名称
        field: 'id',
        // 列名称
        title: 'ID',
        // 提示信息
        titleTooltip: 'ID',
        // 内容对齐方式
        align: 'center',
        // 设置列可排序
        sortable: true,
        // 默认排序规则
        // order: 'desc',
        // false隐藏列
        visible: false,
        // 格式化数据
        formatter: function(value, row, index) {
            return value;
        }
    }, {
        field: 'name',
        title: '名称',
        titleTooltip: '菜单名称',
        align: 'center'
    }, {
        field: 'code',
        title: '编码',
        titleTooltip: '菜单价格',
        align: 'center'
    }, {
        field: 'type',
        title: '类型',
        titleTooltip: '菜单类型',
        align: 'center',
        formatter: function (value, row, index) {
            if(value == 1) {
                return '一级';
            } else {
                return '二级';
            }
        }
    }, {
        field: 'createTime',
        title: '创建时间',
        align: 'center',
        formatter: function (value, row, index) {
            var time = new Date(value);
            return time.toLocaleString();
        }
    }]
});

/**
 * 选中一行事件
 */
$table.on('check.bs.table', function(row){
    $removeBtn.removeAttr('disabled');
});

/**
 * 取消选中一行
 */
$table.on('uncheck.bs.table', function(row) {
    // 获取所有选中的行
    var selections = $table.bootstrapTable('getSelections');
    // 当没有选中任何行的时候，禁用删除按钮
    if(selections.length == 0) {
        $removeBtn.attr('disabled', 'disabled');
    }
});

/**
 * 全选事件
 */
$table.on('check-all.bs.table', function(rows){
    alert('全选');
});

/**
 * 取消全选事件
 */
$table.on('uncheck-all.bs.table', function(rows){
    alert('取消全选');
});