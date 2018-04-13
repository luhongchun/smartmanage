var url = window.location.href;
//导航选择器
/*if (url.indexOf("newsCategoryManage") > 0 || url.indexOf("newsCategoryEdit") > 0) {
  $("#news").addClass("active");
  $("#newsCategoryManage").addClass("active");
} else if (url.indexOf("newsManage") > 0 || url.indexOf("newsEdit") > 0) {
  $("#news").addClass("active");
  $("#newsManage").addClass("active");
}*/

// 提示条配置
toastr.options = {
  "closeButton": true,
  "debug": false,
  "progressBar": true,
  "preventDuplicates": false,
  "positionClass": "toast-top-center",
  "onclick": null,
  "showDuration": "400",
  "hideDuration": "1000",
  "timeOut": "7000",
  "extendedTimeOut": "1000",
  "showEasing": "swing",
  "hideEasing": "linear",
  "showMethod": "fadeIn",
  "hideMethod": "fadeOut"
};

function getPageUrl(page, size) {
  var link = "";
  if (url.indexOf("?") > 0) {
    link = url.substring(0, url.lastIndexOf("/")) + "/" + page + "_" + size
      + url.substring(url.indexOf("?"), url.length);
  } else if (url.substring(url.lastIndexOf("/"), url.length - 1).indexOf("_") > 0) {
    link = url.substring(0, url.lastIndexOf("/")) + "/" + page + "_" + size;
  } else {
    link = url + "/" + page + "_" + size;
  }

  return link;
}

function assemblePager(page, size, totalPages) {
  if (totalPages === 0) {
    return;
  }
  var htmlText = [];
  if (page === 0) {
    htmlText.push('<li class="footable-page-arrow disabled"><a data-page="first" href="#">«</a></li>');
    htmlText.push('<li class="footable-page-arrow disabled"><a data-page="prev" href="#">‹</a></li>');
  } else {
    htmlText.push('<li class="footable-page-arrow disabled"><a data-page="first" href="' + getPageUrl(0, size) + '">«</a></li>');
    htmlText.push('<li class="footable-page-arrow disabled"><a data-page="prev" href="' + getPageUrl((page - 1), size) + '">‹</a></li>');
  }
  for (var i = 0, len = totalPages; i < len; i++) {
    var cls = i === page ? " active" : "";
    htmlText.push('<li class="footable-page'+cls+'"><a data-page="' + i + '" href="' + getPageUrl(i, size) + '">' + (i + 1) + '</a></li>');
  }
  if (page === totalPages) {
    htmlText.push('<li class="footable-page-arrow"><a data-page="next" href="#">›</a></li>');
    htmlText.push('<li class="footable-page-arrow"><a data-page="last" href="#">»</a></li>');
  } else {
    htmlText.push('<li class="footable-page-arrow disabled"><a data-page="next" href="' + getPageUrl((page + 1), size) + '">›</a></li>');
    htmlText.push('<li class="footable-page-arrow disabled"><a data-page="last" href="' + getPageUrl((totalPages - 1), size) + '">»</a></li>');
  }
  $("#pageHTML").append(htmlText.join(''));
}