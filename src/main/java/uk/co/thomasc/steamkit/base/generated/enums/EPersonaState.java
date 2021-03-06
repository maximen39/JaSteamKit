package uk.co.thomasc.steamkit.base.generated.enums;


public enum EPersonaState {

    Offline(0),
    Online(1),
    Busy(2),
    Away(3),
    Snooze(4),
    LookingToTrade(5),
    LookingToPlay(6),
    Invisible(7),
    Max(8),

    ;

    private final int code;

    EPersonaState(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EPersonaState from(int code) {
        for (EPersonaState e : EPersonaState.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
