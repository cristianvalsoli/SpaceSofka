function deletedrone(id){
	swal({
  title: "Are you sure?",
  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
  if (willDelete) { 
	  $.ajax({
		  url:"/deletedrone/"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
    }).then((willDelete)=>{
		if(willDelete){
			location.hreff="/showdrone";
		}
	});
  } else {
    swal("Your imaginary file is safe!");
  }
});
}
function deletedManned(id){
	swal({
  title: "Are you sure?",
  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
  if (willDelete) { 
	  $.ajax({
		  url:"/deleteshowmanned/"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
    }).then((willDelete)=>{
		if(willDelete){
			location.hreff="/showmanned";
		}
	});
  } else {
    swal("Your imaginary file is safe!");
  }
});
}

function deletedShuttle(id){
	swal({
  title: "Are you sure?",
  text: "Once deleted, you will not be able to recover this imaginary file!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((willDelete) => {
  if (willDelete) { 
	  $.ajax({
		  url:"/deletemanned/"+id,
		  success: function(res){
			  console.log(res);
		  }
	  });
    swal("Poof! Your imaginary file has been deleted!", {
      icon: "success",
    }).then((willDelete)=>{
		if(willDelete){
			location.hreff="/showmanned";
		}
	});
  } else {
    swal("Your imaginary file is safe!");
  }
});
}
