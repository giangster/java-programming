class TimePeriod {
    private int hours;
    private int minutes;

    public TimePeriod() {
        this.hours = 0;
        this.minutes = 0;
    }

    public void addHours(int hoursToAdd) {
        if (hoursToAdd >= 0 && hoursToAdd < 100) {
            if ((this.hours + hoursToAdd) < 100) {
                this.hours = this.hours + hoursToAdd;
            }
        }
    }

    // public void addMinutes(int minutesToAdd) {
    // if (minutesToAdd >= 0 && minutesToAdd <= 59) {
    // if (this.hours == 99) {
    // if (this.minutes + minutesToAdd < 60) {
    // this.minutes = this.minutes + minutesToAdd;
    // }
    // } else {
    // this.minutes = this.minutes + minutesToAdd;
    // if (this.minutes >= 60) {
    // this.hours = this.hours + 1;
    // this.minutes = this.minutes - 60;
    // }
    // }
    // }
    // }
    public void addMinutes(int minutesToAdd) {
        if (minutesToAdd < 0 || minutesToAdd > 59) {
            return;
        }
        if (this.minutes + minutesToAdd + this.hours * 60 > 5999) {
            return;
        }
        this.minutes = this.minutes + minutesToAdd;
        if (this.minutes >= 60) {
            this.hours = this.hours + 1;
            this.minutes = this.minutes - 60;
        }

    }

    public String toString() {
        return this.hours + " h " + this.minutes + " min";
    }
}