
var btn=document.getElementById("btn").addEventListener("click", myFunction());
	
	
	



function myFunction() {
	  console.log("hello");
	}



var slider = tns({
  container: '.owl',
  items:2,
  controlsPosition:"bottom",
  mouseDrag: true,
  autoplay: true,
  controls:false,
  nav:false,
  gutter:0,
  autoplayButtonOutput:false,
  responsive: {
    640: {
      gutter: 10,
      items: 2
    },
    700: {
      items:3,
      gutter:0
    },
    900: {
      items: 6,
      gutter:10
    }
  }
});