package CCMSDashBoard.Model;

import CCMSDashBoard.Utilities.Constants.Values;
import org.json.simple.JSONObject;

import java.sql.Time;
import java.time.LocalDateTime;

/**
 * Created by Meave Dregonhive on 23/08/2019.
 */
public class Accident
    {
        private String code;
        private Status generalStatus;

        private Location location;
        private LocalDateTime dateTime;
        private String description;

        private Status policeStatus;
        private Status civilSecurityStatus;
        private Status medicsStatus;
        private Status towingStatus;

        private JSONObject jsonObject;

        private boolean requiresRettungsgasse; //whether or not this location is a highway for instance, which will notify nearby users to launch the Rettungsgasse procedure.
        private boolean requiresPanels; //whether or not deploying panels around the accident is necessary to avoid a curiosity jam.

        public Accident(String code, Location location, LocalDateTime dateTime, String description, boolean requiresRettungsgasse, boolean requiresPanels) {
            this.code = code;
            this.location = location;
            this.dateTime = dateTime;
            this.description = description;
            this.requiresRettungsgasse = requiresRettungsgasse;
            this.requiresPanels = requiresPanels;
            this.generalStatus = Status.NOTTREATED;
            this.policeStatus = Status.NOTNOTIFIED;
            this.civilSecurityStatus = Status.NOTNOTIFIED;
            this.medicsStatus = Status.NOTNOTIFIED;
            this.towingStatus = Status.NOTNOTIFIED;
        }

        public String getGeneralStatus()
            {
                return generalStatus.StatusText();
            }

        public void setGeneralStatus(Status generalStatus)
            {
                this.generalStatus = generalStatus;
            }

        public String getPoliceStatus()
            {
                return policeStatus.StatusText();
            }

        public void setPoliceStatus(Status policeStatus)
            {
                this.policeStatus = policeStatus;
            }

        public String getCivilSecurityStatus() {
            return civilSecurityStatus.StatusText();
        }

        public void setCivilSecurityStatus(Status civilSecurityStatus)
            {
                this.civilSecurityStatus = civilSecurityStatus;
            }

        public String getMedicsStatus()
            {
                return medicsStatus.StatusText();
            }

        public void setMedicsStatus(Status medicsStatus)
            {
                this.medicsStatus = medicsStatus;
            }

        public String getTowingStatus() {
            return towingStatus.StatusText();
        }

        public void setTowingStatus(Status towingStatus)
            {
                this.towingStatus = towingStatus;
            }

        public String getDateTime()
            {
                return dateTime.format(Values.DATETIMEFORMAT);
            }

        public String getCode() {
            return code;
        }

        public String getLocation() {
            return location.getAddress();
        }

        
        public String getDescription() {
            return description;
        }

        public boolean isRequiresRettungsgasse() {
            return requiresRettungsgasse;
        }

        public boolean isRequiresPanels() {
            return requiresPanels;
        }

        public void setJsonObject(JSONObject jsonObject)
        {
            this.jsonObject = jsonObject;
        }

        public JSONObject getJsonObject()
        {
            return jsonObject;
        }
    }
