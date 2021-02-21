import ProcessedCard from "./ProcessedCard";

const ProcessedList = ({processedData, setIndividualProcessed}) => {

    const processedJSX = processedData.map((item) => {
        return (
            <ProcessedCard 
            processed = {item}
            setIndividualProcessed={setIndividualProcessed}
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