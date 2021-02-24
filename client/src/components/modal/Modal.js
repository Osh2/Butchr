import './Modal.css'

const MODAL_STYLES ={
    position: 'fixed',
    backgroundColor: '#622521',
    padding: '10px',

    zIndex: 1000

}

const Modal = ({ open, children }) => {
    if(!open) return null
    return(
        <div>
            <div style={MODAL_STYLES}>
                {children}
            </div>
        </div>
    )
}

export default Modal;