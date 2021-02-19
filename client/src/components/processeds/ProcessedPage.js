import ProcessedList from "./ProcessedList";

const ProcessedPage = function({processedData, setIndividualProcessed}){

    return (
        <>
        <ProcessedList processedData = {processedData} setIndividualProcessed={setIndividualProcessed}/>
        </>
    )
}

export default ProcessedPage;