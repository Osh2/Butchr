import "../../css/MeatPage.css"
import App from "../../App";
import MeatCard from "./MeatCard";
import {useState} from "react"

const MeatList = ({meatData, setIndividualMeat, user}) => {



    const meatJSX = meatData.map((item) => {
            return(
            <MeatCard meat = {item}  key={item.id} user={user} setIndividualMeat={setIndividualMeat}/>
            )
    })



    return(
       <div className="itemList">
            {meatJSX}
        </div>   
    )
}

export default MeatList;