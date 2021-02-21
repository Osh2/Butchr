import MeatCard from "./MeatCard";

const MeatList = ({meatData, setIndividualMeat}) => {

  
    const meatJSX = meatData.map((item) => {
        return(
            <MeatCard meat = {item}  key={item.id} setIndividualMeat={setIndividualMeat}/>
        )
    })
    
    return(
        <div id="meatList">
            {meatJSX}
        </div>
    )
}

export default MeatList;