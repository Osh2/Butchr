import MeatCard from "./MeatCard";

const MeatList = ({meatData}) => {

  
    const meatJSX = meatData.map((item) => {
        return(
            <MeatCard meat = {item}  key={item.id}/>
        )
    })
    
    return(
        <>
            {meatJSX}
        </>
    )
}

export default MeatList;