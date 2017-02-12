package test3;

import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.assertNotEquals;

public class StorageArrayTest extends TestCase {


    @Test
    public static void testCreateLUN() throws Exception {
        StorageArray st = new StorageArray();
        String LunId1 = st.createLUN();
        assertNotNull(LunId1);
        assertEquals(0, st.getLUNsize(LunId1));
        assertEquals(false, st.getLUNexport(LunId1));
        String LunId2 = st.createLUN();
        assertNotNull(LunId2);
        assertEquals(0, st.getLUNsize(LunId2));
        assertEquals(false, st.getLUNexport(LunId2));
        assertNotEquals(LunId1, LunId2);
    }

    @Test
    public static void testResizeLUN() throws Exception {
        StorageArray st = new StorageArray();
        String LunId = st.createLUN();
        st.resizeLUN(LunId, 5);
        assertEquals(5, st.getLUNsize(LunId));
        st.resizeLUN(LunId, -1);
        assertEquals(5, st.getLUNsize(LunId));
        st.resizeLUN(LunId, Integer.MAX_VALUE + 1);
        assertEquals(5, st.getLUNsize(LunId));
        st.resizeLUN(LunId, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, st.getLUNsize(LunId));
        st.resizeLUN(LunId, 0);
        assertEquals(0, st.getLUNsize(LunId));
    }

    @Test
    public static void testExportUnExportLUN() throws Exception {
        StorageArray st = new StorageArray();
        String LunId = st.createLUN();
        assertEquals(false, st.getLUNexport(LunId));
        st.exportLun(LunId);
        assertEquals(true, st.getLUNexport(LunId));
        st.exportLun(LunId);
        st.exportLun(LunId);
        assertEquals(true, st.getLUNexport(LunId));
        st.unexportLun(LunId);
        assertEquals(false, st.getLUNexport(LunId));
        st.unexportLun(LunId);
        st.unexportLun(LunId);
        assertEquals(false, st.getLUNexport(LunId));
    }

    @Test
    public static void testRemoveLun() throws Exception {
        StorageArray st = new StorageArray();
        String LunId = st.createLUN();
        assertNotNull(LunId);
        st.removeLun(LunId);
        assertNull(st.getLUN(LunId));
        String LunId1 = st.createLUN();
        String LunId2 = st.createLUN();
        st.removeLun(LunId1);
        st.removeLun(LunId2);
        assertNull(st.getLUN(LunId1));
        assertNull(st.getLUN(LunId2));
    }
}
