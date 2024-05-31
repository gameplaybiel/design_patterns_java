package org.DesignsPatterns.Bridge.platforms;

import org.DesignsPatterns.Bridge.transmissions.Live;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na Transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberados na live");
    }
}
