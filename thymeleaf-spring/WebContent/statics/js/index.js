$(document).ready(function() {
	VM_index.addEventHandlers();
})

var VM_index = {
	addEventHandlers: function(){
		var me = this;
		$('#btn_gohome').on('click', function(e){
			e.preventDefault();
			me.goHome();
		})
		$('#btn_godirect').on('click', function(e){
			e.preventDefault();
			$(location).attr('href', 'direct');
		})
	},
	
	goHome: function(){
		$(location).attr('href', 'home');
	}
}