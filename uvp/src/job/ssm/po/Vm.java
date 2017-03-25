package job.ssm.po;

public class Vm {
    private Integer id;

    private Integer userid;

    private String name;

    private Integer mem;

    private Integer disk;

    private Integer nums;

    private Integer pmnumbers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public Integer getDisk() {
        return disk;
    }

    public void setDisk(Integer disk) {
        this.disk = disk;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Integer getPmnumbers() {
        return pmnumbers;
    }

    public void setPmnumbers(Integer pmnumbers) {
        this.pmnumbers = pmnumbers;
    }
}