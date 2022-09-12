package task1.service;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import task1.exceptions.NoShapeExptection;
import task1.model.*;

import static org.junit.Assert.*;

public class CircleServiceTest {

    private CircleService circleService;
    private Circle c1;

    @Mock // mockowanie jest tu używane na siłę
    private Circle c2;

    @Before
    public void init() {
        circleService = new CircleService();
        c1 = new Circle(5);
    }

    @Test
    public void shouldThrowNoShapeException() { // Assertions użyte na siłę
        Throwable throwable = new NoShapeExptection();
        Throwable e = assertThrows(NoShapeExptection.class, () -> circleService.countArea(null));
        Assertions.assertThat(e)
                .hasSameClassAs(throwable)
                .hasMessage(null)
                .hasFieldOrProperty("message");
    }

    @Test
    public void shouldThrowNoShapeException2() { // SoftAssertions użyte na siłę
        Throwable throwable = new NoShapeExptection();
        Throwable e = assertThrows(NoShapeExptection.class, () -> circleService.countPerimeter(null));
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(e.getClass()).isEqualTo(throwable.getClass());
        softAssertions.assertThat(e.getMessage()).isEqualTo(null);
        softAssertions.assertAll();
    }

    @Test // test na siłe, aby pokazać mockowanie
    public void shouldReturnAreaIs16Pi() {
        MockitoAnnotations.openMocks(this);
        Mockito.when(c2.getRadius()).thenReturn(4);
        assertEquals(Math.PI * 16, circleService.countArea(c2), 0.01);
    }

    @Test
    public void shouldReturnAreaIs25Pi() {
        assertEquals(Math.PI * 25, circleService.countArea(c1), 0.01);
    }

    @Test
    public void shouldReturnPerimeterIs10Pi() {
        assertEquals(Math.PI * 10, circleService.countPerimeter(c1), 0.01);
    }


}