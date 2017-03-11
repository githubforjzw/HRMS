$(function(){
	$('#index_content_info').tabs('add',{
		title:'欢迎使用',
		href:'toFirst',
		fit:true,
		closable: false
	});
	
	$('#humanResourceFileManage').tree({
		onClick: function(node){
			var id=node.id;
			var title='主页';
			var href='toFirst';
			var tabObj=$('#index_content_info');
			
			if(id=="humanResourceFileLoad"){	//人力资源档案登记页面
				if(tabObj.tabs("exists","人力资源档案登记")){
					tabObj.tabs("select","人力资源档案登记");
					return;
				}else{
					title="人力资源档案登记";
					href="toHumanResourceFileLoad";
				}
			}else if(id=="humanResourceFileCheck"){	//人力资源档案登记复核
				if(tabObj.tabs("exists","人力资源档案登记复核")){
					tabObj.tabs("select","人力资源档案登记复核");
					return;
				}else{
					title="人力资源档案登记复核";
					href="toHumanResourceFileCheck";
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

