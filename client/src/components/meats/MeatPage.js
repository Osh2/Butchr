import MeatList from "./MeatList"

const MeatPage = function({meatData, setIndividualMeat}) {
    
    
    return (
        <>
            <MeatList  meatData={meatData} setIndividualMeat={setIndividualMeat}/>
        </>
    )
}

export default MeatPage;