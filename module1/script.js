document.addEventListener("DOMContentLoaded", () => {
  const events = [
    {
      title: "Live Jazz Night",
      date: "2025-05-25",
      location: "Downtown Café",
      category: "music",
      description: "Enjoy an evening of live jazz with local bands."
    },
    {
      title: "Farmers Market",
      date: "2025-05-26",
      location: "Central Park",
      category: "market",
      description: "Fresh produce, handmade goods, and more!"
    },
    {
      title: "Art Workshop",
      date: "2025-05-27",
      location: "Community Hall",
      category: "art",
      description: "Free art workshop for all ages. Supplies provided."
    },
    {
      title: "Neighborhood Meeting",
      date: "2025-05-28",
      location: "Library Room A",
      category: "meeting",
      description: "Discuss local development projects and community feedback."
    }
  ];

  const mainContent = document.getElementById("mainContent");
  const categoryFilter = document.getElementById("categoryFilter");

  function createEventCard(event) {
    const card = document.createElement("div");
    card.className = "event-card";
    card.innerHTML = `
      <h2>${event.title}</h2>
      <p><strong>Date:</strong> ${event.date}</p>
      <p><strong>Location:</strong> ${event.location}</p>
      <p><strong>Category:</strong> ${event.category}</p>
      <p>${event.description}</p>
    `;
    return card;
  }

  function renderEvents(eventsToRender) {
    mainContent.innerHTML = "";
    if (eventsToRender.length === 0) {
      mainContent.innerHTML = "<p>No events found for this category.</p>";
    } else {
      eventsToRender.forEach(event => {
        mainContent.appendChild(createEventCard(event));
      });
    }
  }

  // Initial render
  renderEvents(events);

  // Filter events on dropdown change
  categoryFilter.addEventListener("change", () => {
    const selected = categoryFilter.value;
    const filtered = selected
      ? events.filter(event => event.category === selected)
      : events;
    renderEvents(filtered);
  });
});
