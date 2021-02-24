import React, { useEffect, useState } from 'react'
import FullCalendar, { formatDate } from '@fullcalendar/react'
import dayGridPlugin from '@fullcalendar/daygrid'
import timeGridPlugin from '@fullcalendar/timegrid'
import interactionPlugin from '@fullcalendar/interaction'
import { INITIAL_EVENTS, createEventId } from './Event'

const Calendar = () => {

    const [eventsInfo, setEventsInfo] = useState([]);
    
    let convertedEventsArray = []
    const convertEvents = eventsInfo.map((event)=> {
        let convertedEvent = {
             title : event.title,
             start : event.date
        }
        convertedEventsArray.push(convertedEvent);
        
    })

    const sideBar = () => {
        return(
        <div className='demo-app-sidebar'>
            <div className='demo-app-sidebar-section'>
            <h2>Arrange your collection</h2>
            <ul>
                <li>To book a collection slot please select the "week" view</li>
                <li>Click on the desired day and time to select your slot</li>
                <li>You will then be prompted to enter an event title, please enter your name</li>
                <li>Drag, drop, and resize events</li>
                <li>Click an event to delete it</li>
            </ul>
            </div>
            <div className='demo-app-sidebar-section'>
            <h2>Upcoming bookings ({eventsInfo.length})</h2>
            <ul>
                {eventsInfo.map(renderSidebarEvent)}
            </ul>
            </div>
        </div>
        )
    }

        const handleDateSelect = (selectInfo) => {
            let title = prompt('Please enter the name for collection')
            let calendarApi = selectInfo.view.calendar
        
            calendarApi.unselect() 
        
                if (title) {
                calendarApi.addEvent({
                    id: createEventId(),
                    title,
                    start: selectInfo.startStr,
                    end: selectInfo.endStr,
                    allDay: selectInfo.allDay
                })
                }
            }
    
        const handleEventClick = (clickInfo) => {
            let result = window.confirm(`Are you sure you want to delete the collection for '${clickInfo.event.title}'`) 
            if( result === true) {
            clickInfo.event.remove()
            }
        }
    
        const handleEvents = (event) => {
            setEventsInfo(event)
        }
    
        function renderEventContent(eventInfo) {
            return (
                <>
                    <b>{eventInfo.date}</b>
                    <i>{eventInfo.event.title}</i>
                </>
            )
        }
    
        function renderSidebarEvent(event) {
            return (
                <li key={event.id}>
                <b>{formatDate(event.date, {year: 'numeric', month: 'short', day: 'numeric'})}</b>
                <i>{" " + event.title}</i>
                </li>
            )
        }

    return (
      <div className='demo-app'>
        {sideBar()}
        <div className='demo-app-main'>
          <FullCalendar
            plugins={[dayGridPlugin, timeGridPlugin, interactionPlugin]}
            headerToolbar={{
              left: 'prev,next today',
              center: 'title',
              right: 'dayGridMonth,timeGridWeek,timeGridDay'
            }}
            initialView='timeGridWeek'
            editable={true}
            selectable={true}
            selectMirror={true}
            dayMaxEvents={true}
            weekends={true}
            initialEvents={eventsInfo} 
            select={handleDateSelect}
            eventContent={renderEventContent} 
            eventClick={handleEventClick}
            eventsSet={handleEvents} 
          />
        </div>
      </div>
    )
}

export default Calendar;