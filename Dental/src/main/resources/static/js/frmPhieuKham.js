jQuery("#addDichVu").click(function(){
        console.log("sssssssssssssss");
        var quantity = $('input#quantityService').val();
        var totlePrice = $("#myselect option:selected" ).data('price') * quantity;
        var preHtml = '<tr>' +
            '<td>1</td>' + 
            '<td class="serviceCode">'+ $("#myselect option:selected" ).data('code') +'</td>' + 
            '<td>'+$("#myselect option:selected" ).text()+'</td>' + 
            '<td>'+$("#myselect option:selected" ).data('price')+'</td>' + 
            '<td class="serviceQuantity">'+quantity+'</td>' + 
            '<td class="serviceTotal">'+totlePrice+'</td>' + 
            '<td>' + 
                '<a href=""><span class="fa fa-pencil"></span></a>' + 
                '<a href="#" id="a-delete"><span class="fa fa-trash"></span></a>' + 
            '</td>' + 
        '</tr>';
        $("#totlePrice").text(Number($("#totlePrice").text()) + totlePrice);
        $("tbody#bodyService").append(preHtml);
    })

        jQuery("#submitBtn").click(function(){
        var e = document.getElementById("bodyService");
        var trItem = e.getElementsByTagName("tr");
        var listService = [];
        for (var n=0; n< trItem.length; n++)
        {
            //alert(trItem[n].getElementsByClassName("serviceCode")[0].innerText);
            listService.push({
                serviceCode: trItem[n].getElementsByClassName("serviceCode")[0].innerText,
                serviceQuantity: trItem[n].getElementsByClassName("serviceQuantity")[0].innerText
                });
        }
        console.log(listService);
        var dataA = { 
            
          };
    /*      dataA["listService"] = listService;
          dataA["addService"] = 122;

          console.log("dataA");
          console.log(JSON.stringify(dataA));

        

        $.ajax("http://localhost:8082/addService", {
            type:"POST",
            contentType: "application/json",
            
            dataType:"json",
            data:{addService:"something"}, 
            
        }); */
    })