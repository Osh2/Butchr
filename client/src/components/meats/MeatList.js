import MeatCard from "./MeatCard";

const MeatList = ({meatData}) => {

  
    const meatJSX = meatData.map((item) => {
        return(
            <MeatCard meatName = {item.name}  key={item.id}/>
        )
    })
    
    return(
        <>
            {meatJSX}
        </>
    )
}

export default MeatList;