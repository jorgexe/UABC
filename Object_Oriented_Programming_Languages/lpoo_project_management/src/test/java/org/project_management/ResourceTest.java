package org.project_management;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ResourceTest {

    @Test
    void resourceConstructor_ShouldCorrectlyAssignFields() {
        Date startDate = new Date(2023, 1, 1);
        Date endDate = new Date(2023, 12, 31);
        Resource resource = new Resource("001", "Test Resource", startDate, endDate, "Resource Test");

        assertEquals("001", resource.getId(), "El ID del recurso no se estableció correctamente.");
        assertEquals("Resource Test", resource.getName(), "El nombre del recurso no se estableció correctamente.");
        assertEquals(startDate, resource.getStartDate(), "La fecha de inicio no se estableció correctamente.");
        assertEquals(endDate, resource.getEndDate(), "La fecha de finalización no se estableció correctamente.");
    }

    @Test
    void isAvailable_ShouldReturnTrue_WhenDatesDoNotOverlap() {
        Resource resource = new Resource("001", "Test Resource", new Date(2023, 1, 1), new Date(2023, 6, 30), "Resource Test");
        Date checkStartDate = new Date(2023, 7, 1);
        Date checkEndDate = new Date(2023, 12, 31);

        assertTrue(resource.isAvailable(checkStartDate, checkEndDate), "El recurso debería estar disponible cuando las fechas no se superponen.");
    }

    @Test
    void isAvailable_ShouldReturnFalse_WhenDatesOverlap() {
        Resource resource = new Resource("001", "Test Resource", new Date(2023, 1, 1), new Date(2023, 12, 31), "Resource Test");
        Date checkStartDate = new Date(2023, 1, 15);
        Date checkEndDate = new Date(2023, 2, 15);

        assertFalse(resource.isAvailable(checkStartDate, checkEndDate), "El recurso no debería estar disponible cuando las fechas se superponen.");
    }

}
