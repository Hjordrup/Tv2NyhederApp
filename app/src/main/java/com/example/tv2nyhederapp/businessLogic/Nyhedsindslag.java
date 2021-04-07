package com.example.tv2nyhederapp.businessLogic;

import java.util.Date;

public class Nyhedsindslag {

    private String overskrift, teaserText, linkTilVideo, linkTilStillbillede;
    private Date udgivelsesdato;
    private boolean udgivgetEllerEj, slettet;

    public Nyhedsindslag(String overskrift, String teaserText, String linkTilStillbillede) {
        this.overskrift = overskrift;
        this.teaserText = teaserText;
        this.linkTilStillbillede = linkTilStillbillede;
    }

    public Nyhedsindslag() {
    }

    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public String getTeaserText() {
        return teaserText;
    }

    public void setTeaserText(String teaserText) {
        this.teaserText = teaserText;
    }

    public String getLinkTilVideo() {
        return linkTilVideo;
    }

    public void setLinkTilVideo(String linkTilVideo) {
        this.linkTilVideo = linkTilVideo;
    }

    public String getLinkTilStillbillede() {
        return linkTilStillbillede;
    }

    public void setLinkTilStillbillede(String linkTilStillbillede) {
        this.linkTilStillbillede = linkTilStillbillede;
    }

    public Date getUdgivelsesdato() {
        return udgivelsesdato;
    }

    public void setUdgivelsesdato(Date udgivelsesdato) {
        this.udgivelsesdato = udgivelsesdato;
    }

    public boolean isUdgivgetEllerEj() {
        return udgivgetEllerEj;
    }

    public void setUdgivgetEllerEj(boolean udgivgetEllerEj) {
        this.udgivgetEllerEj = udgivgetEllerEj;
    }

    public boolean isSlettet() {
        return slettet;
    }

    public void setSlettet(boolean slettet) {
        this.slettet = slettet;
    }
}
