package demo.project.gradle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ExampleTest {

   @Mock
   private Callee calleeMock;

   @Test
   public void test() {

      when(calleeMock.method1()).thenReturn(456);

      assertEquals(456, calleeMock.method1());
   }

}
