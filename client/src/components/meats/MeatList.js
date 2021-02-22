import MeatPage from "../../css/MeatPage.css"

import MeatCard from "./MeatCard";

const MeatList = ({meatData, setIndividualMeat, user}) => {

  
    const meatJSX = meatData.map((item) => {
        return(
            <MeatCard meat = {item}  key={item.id} user={user} setIndividualMeat={setIndividualMeat}/>
        )
    })
    
    return(
        <div id="meatList">
            {meatJSX}
        </div>
    )
}

export default MeatList;