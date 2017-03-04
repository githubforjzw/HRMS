$(function(){
	$('#index_content_info').tabs('add',{
		title:'欢迎使用',
		href:'toFirst',
		fit:true,
		closable: false
	});
	
	$('#foods_menu').tree({
		onClick: function(node){
			var id=node.id;
			var title='主页';
			var href='toFirst';
			var tabObj=$('#index_content_info');
			
			if(id=="manager_foods"){
				if(tabObj.tabs("exists","管理商品")){
					tabObj.tabs("select","管理商品");
					return;
				}else{
					title="管理商品";
					href="manager_foods.html";
				}
				
			}else if(id=="login_info"){
				if(tabObj.tabs("exists","登录信息")){
					tabObj.tabs("select","登录信息");
					return;
				}else{
					title="登录信息";
					href="userLoginInfo.jsp";
				}
			}else if(id=="rank_info"){
				if(tabObj.tabs("exists","积分排行榜")){
					tabObj.tabs("select","积分排行榜");
					return;
				}else{
					title="积分排行榜";
					href="rankInfo.jsp";
				}
				
			}else if(id=="alluser_login"){
				if(tabObj.tabs("exists","顾客信息")){
					tabObj.tabs("select","顾客信息");
					return;
				}else{
					title="顾客信息";
					href="manager_users.html";
				}
				
			}
			
			tabObj.tabs('add',{
				title:title,
				href:href,
				fit:true,
				closable:true
			});
		}
	});

})

