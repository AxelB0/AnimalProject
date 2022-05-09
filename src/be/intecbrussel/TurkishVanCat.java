package be.intecbrussel;

public class TurkishVanCat extends Felis {

    public String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "TurkishVanCat{}";
    }
}
