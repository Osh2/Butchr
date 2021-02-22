import MeatList from "./MeatList"

const MeatPage = function({meatData, setIndividualMeat, user}) {
    
    
    return (
        <>
            <MeatList  meatData={meatData} user={user} setIndividualMeat={setIndividualMeat}/>
        </>
    )
}

export default MeatPage;