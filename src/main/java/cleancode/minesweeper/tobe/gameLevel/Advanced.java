package cleancode.minesweeper.tobe.gameLevel;

public class Advanced implements GameLevel {

    @Override
    public int getLowSize() {
        return 20;
    }

    @Override
    public int getColSize() {
        return 24;
    }

    @Override
    public int getLandMineCount() {
        return 99;
    }

}
