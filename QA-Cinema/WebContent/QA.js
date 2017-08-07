$(function() {

    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});

});


function createSeats(oSeatsContainer,seatsPerRow,rowNames){
    var oRow = document.createElement('tr');
    oRow.appendChild(document.createElement('th'));
    for(i=1; i <= seatsPerRow; i++){
        var oTh = document.createElement('th');
        oTh.appendChild(document.createTextNode(i));
        oRow.appendChild(oTh);
    }
    oSeatsContainer.appendChild(oRow); //this row contains the seat numbers
    for(i=0; i < rowNames.length; i++){
        var oRow = document.createElement('tr');
        var oCell = document.createElement('td');
        oCell.innerHTML = rowNames[i];
        oRow.appendChild(oCell);
        for(j=0; j < seatsPerRow; j++){
            oCell = document.createElement('td');
            var oImg = document.createElement('img');
            oImg.src = statusPics['avail'].src;
            oImg.status = 'avail';
            oImg.id = rowNames[i]+(j+1);
            oImg.onclick=function(){
                this.status = (this.status == 'avail')? 'mine' : 'avail';
                this.src = (this.status == 'avail')? statusPics['avail'].src : statusPics['mine'].src;
                oTotalprice.innerHTML = '';
                oBookedSeatNos.innerHTML = '';
                oBtnCheckout.disabled = true;
            }
            oCell.appendChild(oImg);
            oRow.appendChild(oCell);
        }
        oSeatsContainer.appendChild(oRow);
    }
}
function confirmChoices(){
    premSeatsSelected = new Array();
    for(i=0; i < oPremSeats.length; i++){
        if(oPremSeats[i].status == 'mine'){
            premSeatsSelected.push(oPremSeats[i].id);
            oPremSeats[i].src=statusPics['taken'].src
        }
    }
    cheapSeatsSelected = new Array;
    for(i=0; i < oCheapSeats.length; i++){
        if(oCheapSeats[i].status == 'mine'){
            cheapSeatsSelected.push(oCheapSeats[i].id);
            oCheapSeats[i].src=statusPics['taken'].src
        }
    }
    oBtnCheckout.disabled = (premSeatsSelected.length > 0 || cheapSeatsSelected.length > 0)? false : true;
}
function checkout(){
    var cheapSeatPrice = 5;
    var premSeatPrice = 10;
    var totPrice = (premSeatsSelected.length*premSeatPrice)+(cheapSeatsSelected.length*cheapSeatPrice);
    if(totPrice > 0){
        oTotalprice.innerHTML = totPrice;
        var strBookedSeats = 'Booked seat numbers: ';
        for(i=0; i < premSeatsSelected.length; i++){
            strBookedSeats += premSeatsSelected[i] + ' ';
        }
        for(i=0; i < cheapSeatsSelected.length; i++){
            strBookedSeats += cheapSeatsSelected[i] + ' ';
        }
    }
    oBookedSeatNos.innerHTML = strBookedSeats; 
}
window.onload=function(){
    oTblPremium = document.getElementById('tblPremium');
    oTblCheap = document.getElementById('tblCheap');
    oPremSeats = oTblPremium.getElementsByTagName('img');
    oCheapSeats = oTblCheap.getElementsByTagName('img');
    oBtnCheckout = document.getElementById('checkout');
    oTotalprice = document.getElementById('totalprice');
    oBookedSeatNos = document.getElementById('bookedSeatNos');
    oBtnCheckout.onclick=checkout;
    createSeats(oTblPremium,numPremSeatsPerRow,PremRowNames); //create premium seats
    createSeats(oTblCheap,numCheapSeatsPerRow,CheapRowNames); //create cheap seats
    document.getElementById('confirm').onclick=confirmChoices;
    document.getElementById('btnReset').onclick=function(){
        oTotalprice.innerHTML = '';
        oBtnCheckout.disabled = true;
        oBookedSeatNos.innerHTML = '';
        for(i=0; i < oPremSeats.length; i++){
            oPremSeats[i].src = statusPics['avail'].src;
            oPremSeats[i].status = 'avail';
        }
        for(i=0; i < oCheapSeats.length; i++){
            oCheapSeats[i].src = statusPics['avail'].src;
            oCheapSeats[i].status = 'avail';
        }
    }
    document.getElementById('imgAvail').src = statusPics['avail'].src;
    document.getElementById('imgMine').src = statusPics['mine'].src;
    document.getElementById('imgTaken').src = statusPics['taken'].src;
}






$(function(){
  $(".dropdown").hover(            
    function() {
      $('.dropdown-menu', this).stop( true, true ).fadeIn("fast");
      $(this).toggleClass('open');
      $('b', this).toggleClass("caret caret-up");                
    },
    function() {
      $('.dropdown-menu', this).stop( true, true ).fadeOut("fast");
      $(this).toggleClass('open');
      $('b', this).toggleClass("caret caret-up");                
    });
});