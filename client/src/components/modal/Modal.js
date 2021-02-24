import './Modal.css'



const Modal = ({ open, children }) => {
    if(!open) return null
    return(
        <div>
            <div className="modal" >
                {children}
            </div>
        </div>
    )
}

export default Modal;