package com.moppy.control.config;

import com.moppy.core.events.mapper.scripts.ConditionScripts;
import com.moppy.core.events.mapper.scripts.DeviceAddressScripts;
import com.moppy.core.events.mapper.scripts.NoteScripts;
import com.moppy.core.events.mapper.scripts.SubAddressScripts;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 * Stores configuration options in a JSON-serializable format.
 */
@Data
public class MoppyConfig {
    private String fileLoadDirectory = ".";
    private List<MIDIScriptMapperConfig> mapperConfigs = new ArrayList<>();

    @Data
    public static class MIDIScriptMapperConfig {
        private String conditionChoice = "Custom";
        private String conditionCustomScript = ConditionScripts.ALL_EVENTS.toString();
        private String deviceAddressChoice = "Custom";
        private String deviceAddressCustomScript = DeviceAddressScripts.DEVICE_ONE.toString();
        private String subAddressChoice = "Custom";
        private String subAddressCustomScript = SubAddressScripts.SUB_ADDRESS_PER_CHANNEL.toString();
        private String noteChoice = "Custom";
        private String noteCustomScript = NoteScripts.STRAIGHT_THROUGH.toString();
    }
}