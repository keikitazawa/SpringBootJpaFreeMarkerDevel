/**
 * 
 */
$(document).ready(
	function(){
		// ボタン・クリック時の処理
		$("#ReloadButton").click(
			function(){
				$.ajax({
					async: false,
					cache: false,
					dataType: "html",
					type: "POST",
					url: "/admin/taxonomygroup/html",
					data: {
						"_csrf" : $("#ModalForm input[name=_csrf]").val()
					}
				})
				.done(
					function(data, textStatus, jqXHR){
						$("#SearchTaxonomyGroup").html(data);
					}
				)
				.fail(
					function(jqXHR, textStatus, errorThrown){
						alert(jqXHR.status + "\n" + textStatus + "\n" + errorThrown);
					}
				)
				.always(
					function(jqXHR, textStatus){
					}
				);
			}
		);
	}
);



