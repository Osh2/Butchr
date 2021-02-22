import ProcessedCard from "./ProcessedCard";

const ProcessedList = ({processedData, setIndividualProcessed, user }) => {

    const processedJSX = processedData.map((item) => {
        return (
            <ProcessedCard 
            processed = {item}
            setIndividualProcessed={setIndividualProcessed}
            user={user}
            key = {item.id}/>
        )
    })

    return (
        <div id="processedList">
            {processedJSX}
        </div>
    )
}


export default ProcessedList;