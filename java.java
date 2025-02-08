function flames() {
    const str1 = document.getElementById('name1').value.toLowerCase().replace(/\s/g, '');
    const str2 = document.getElementById('name2').value.toLowerCase().replace(/\s/g, '');

    let name1 = str1.split("");
    let name2 = str2.split("");
    for (let i = 0; i < name1.length; i++) {
        for (let j = 0; j < name2.length; j++) {
            if (name1[i] === name2[j]) {
                name1[i] = name2[j] = ""; 
                break;
            }
        }
    }

   
    let count = (name1.join("") + name2.join("")).length;
    
    if (count === 0) {
        alert("Enter different names!");
        return;
    }

    let flamesStr = "FLAMES";
    let flamesArr = flamesStr.split("");

    while (flamesArr.length > 1) {
        let index = (count % flamesArr.length) - 1;
        if (index >= 0) {
            flamesArr.splice(index, 1);
        } else {
            flamesArr.pop();
        }
    }

    let result = flamesArr[0];

    let meaning = {
        "F": "Friends",
        "L": "Love",
        "A": "Affection",
        "M": "Marriage",
        "E": "Enemies",
        "S": "Siblings"
    };

    alert(`The relationship is: ${meaning[result]}`);
}
