package test3;

import javax.jws.WebService;

@WebService
public class StorageArray {

    public String createLUN() throws Exception {
        try {
            LUN Lun = new LUN();
            LUNmanager.insertLUN(Lun);
            return Lun.getId();
        } catch (Exception e) {
            e.printStackTrace();
            return ("");
        }
    }

    public boolean resizeLUN(String LunId, int size) {
        try {
            if (size >= 0 && size <= Integer.MAX_VALUE) {
                LUN Lun = LUNmanager.getLUN(LunId);
                Lun.setSize(size);
                return LUNmanager.updateLUN(Lun);
            } else {
                System.out.println("size should be greater than 0 and less than Integer.MAX_VALUE");
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean exportLun(String LunId) {
        try {
            LUN Lun = LUNmanager.getLUN(LunId);
            Lun.setExport(true);
            return LUNmanager.updateLUN(Lun);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean unexportLun(String LunId) {
        try {
            LUN Lun = LUNmanager.getLUN(LunId);
            Lun.setExport(false);
            return LUNmanager.updateLUN(Lun);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeLun(String LunId) {
        try {
            LUN Lun = LUNmanager.getLUN(LunId);
            return LUNmanager.deleteLUN(Lun);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public int getLUNsize(String LunId) {
        try {
            LUN lun = LUNmanager.getLUN(LunId);
            return lun.getSize();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return -1;
        }
    }

    public boolean getLUNexport(String LunId) {
        try {
            LUN lun = LUNmanager.getLUN(LunId);
            return lun.getExport();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public LUN getLUN(String LunId) {
        try {
            LUN lun = LUNmanager.getLUN(LunId);
            return lun;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

}
