import ProcessedList from "./ProcessedList";

const ProcessedPage = function({processedData, setIndividualProcessed, user}){

    return (
        <>
        <ProcessedList processedData = {processedData} setIndividualProcessed={setIndividualProcessed}
        user={user}
        />
        </>
    )
}

export default ProcessedPage;