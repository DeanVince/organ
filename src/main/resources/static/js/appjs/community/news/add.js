$().ready(function() {
    $('.summernote').summernote({
        height : '220px',
    });
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save(1);
	}
});
function save() {
    $("#status").val(status);
    var content_sn = $("#content_sn").summernote('code');
    $("#content").val(content_sn);
	$.ajax({
		cache : true,
		type : "POST",
		url : "/community/news/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				if(parent.reLoad){
                    parent.reLoad();
                }else {
                    window.location.reload();
                }
                var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
                parent.layer.close(index);
			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入姓名"
			}
		}
	})
}
