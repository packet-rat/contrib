//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.17 at 04:06:30 PM EDT 
//


package org.mitre.cybox.default_vocabularies_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTypeEnum-1.0.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTypeEnum-1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Access"/>
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Alert"/>
 *     &lt;enumeration value="Allocate"/>
 *     &lt;enumeration value="Archive"/>
 *     &lt;enumeration value="Assign"/>
 *     &lt;enumeration value="Audit"/>
 *     &lt;enumeration value="Backup"/>
 *     &lt;enumeration value="Bind"/>
 *     &lt;enumeration value="Block"/>
 *     &lt;enumeration value="Call"/>
 *     &lt;enumeration value="Change"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="Clean"/>
 *     &lt;enumeration value="Click"/>
 *     &lt;enumeration value="Close"/>
 *     &lt;enumeration value="Compare"/>
 *     &lt;enumeration value="Compress"/>
 *     &lt;enumeration value="Configure"/>
 *     &lt;enumeration value="Connect"/>
 *     &lt;enumeration value="Control"/>
 *     &lt;enumeration value="Copy/Duplicate"/>
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Decode"/>
 *     &lt;enumeration value="Decompress"/>
 *     &lt;enumeration value="Decrypt"/>
 *     &lt;enumeration value="Deny"/>
 *     &lt;enumeration value="Depress"/>
 *     &lt;enumeration value="Detect"/>
 *     &lt;enumeration value="Disconnect"/>
 *     &lt;enumeration value="Download"/>
 *     &lt;enumeration value="Draw"/>
 *     &lt;enumeration value="Drop"/>
 *     &lt;enumeration value="Encode"/>
 *     &lt;enumeration value="Encrypt"/>
 *     &lt;enumeration value="Enumerate"/>
 *     &lt;enumeration value="Execute"/>
 *     &lt;enumeration value="Extract"/>
 *     &lt;enumeration value="Filter"/>
 *     &lt;enumeration value="Find"/>
 *     &lt;enumeration value="Flush"/>
 *     &lt;enumeration value="Fork"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="Get"/>
 *     &lt;enumeration value="Hook"/>
 *     &lt;enumeration value="Hide"/>
 *     &lt;enumeration value="Impersonate"/>
 *     &lt;enumeration value="Initialize"/>
 *     &lt;enumeration value="Inject"/>
 *     &lt;enumeration value="Install"/>
 *     &lt;enumeration value="Interleave"/>
 *     &lt;enumeration value="Join"/>
 *     &lt;enumeration value="Kill"/>
 *     &lt;enumeration value="Listen"/>
 *     &lt;enumeration value="Load"/>
 *     &lt;enumeration value="Lock"/>
 *     &lt;enumeration value="Login/Logon"/>
 *     &lt;enumeration value="Logout/Logoff"/>
 *     &lt;enumeration value="Map"/>
 *     &lt;enumeration value="Merge"/>
 *     &lt;enumeration value="Modify"/>
 *     &lt;enumeration value="Monitor"/>
 *     &lt;enumeration value="Move"/>
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Pack"/>
 *     &lt;enumeration value="Pause"/>
 *     &lt;enumeration value="Press"/>
 *     &lt;enumeration value="Protect"/>
 *     &lt;enumeration value="Quarantine"/>
 *     &lt;enumeration value="Query"/>
 *     &lt;enumeration value="Queue"/>
 *     &lt;enumeration value="Raise"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Receive"/>
 *     &lt;enumeration value="Release"/>
 *     &lt;enumeration value="Rename"/>
 *     &lt;enumeration value="Remove/Delete"/>
 *     &lt;enumeration value="Replicate"/>
 *     &lt;enumeration value="Restore"/>
 *     &lt;enumeration value="Resume"/>
 *     &lt;enumeration value="Revert"/>
 *     &lt;enumeration value="Run"/>
 *     &lt;enumeration value="Save"/>
 *     &lt;enumeration value="Scan"/>
 *     &lt;enumeration value="Schedule"/>
 *     &lt;enumeration value="Search"/>
 *     &lt;enumeration value="Send"/>
 *     &lt;enumeration value="Set"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="Sleep"/>
 *     &lt;enumeration value="Snapshot"/>
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Stop"/>
 *     &lt;enumeration value="Suspend"/>
 *     &lt;enumeration value="Synchronize"/>
 *     &lt;enumeration value="Throw"/>
 *     &lt;enumeration value="Transmit"/>
 *     &lt;enumeration value="Unblock"/>
 *     &lt;enumeration value="Unhide"/>
 *     &lt;enumeration value="Unhook"/>
 *     &lt;enumeration value="Uninstall"/>
 *     &lt;enumeration value="Unload"/>
 *     &lt;enumeration value="Unlock"/>
 *     &lt;enumeration value="Unmap"/>
 *     &lt;enumeration value="Unpack"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Upgrade"/>
 *     &lt;enumeration value="Upload"/>
 *     &lt;enumeration value="Wipe/Destroy/Purge"/>
 *     &lt;enumeration value="Write"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionTypeEnum-1.0")
@XmlEnum
public enum ActionTypeEnum10 {


    /**
     * Specifies the atomic action of accepting an object or value.
     * 
     */
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),

    /**
     * Specifies the atomic action of accessing an object.
     * 
     */
    @XmlEnumValue("Access")
    ACCESS("Access"),

    /**
     * Specifies the atomic action of adding an object.
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * Specifies the atomic action of issuing an alert.
     * 
     */
    @XmlEnumValue("Alert")
    ALERT("Alert"),

    /**
     * Specifies the atomic action of allocating an object.
     * 
     */
    @XmlEnumValue("Allocate")
    ALLOCATE("Allocate"),

    /**
     * Specifies the atomic action of archiving an object or data.
     * 
     */
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),

    /**
     * Specifies the atomic action of assigning a value to an object.
     * 
     */
    @XmlEnumValue("Assign")
    ASSIGN("Assign"),

    /**
     * Specifies the atomic action of auditing an object or data.
     * 
     */
    @XmlEnumValue("Audit")
    AUDIT("Audit"),

    /**
     * Specifies the atomic action of backing up an object or data.
     * 
     */
    @XmlEnumValue("Backup")
    BACKUP("Backup"),

    /**
     * Specifies the atomic action of binding two objects.
     * 
     */
    @XmlEnumValue("Bind")
    BIND("Bind"),

    /**
     * Specifies the atomic action of blocking access to an object or resource.
     * 
     */
    @XmlEnumValue("Block")
    BLOCK("Block"),

    /**
     * Specifies the atomic action of calling an object or resource.
     * 
     */
    @XmlEnumValue("Call")
    CALL("Call"),

    /**
     * Specifies the atomic action of changing an object.
     * 
     */
    @XmlEnumValue("Change")
    CHANGE("Change"),

    /**
     * Specifies the atomic action of checking an object.
     * 
     */
    @XmlEnumValue("Check")
    CHECK("Check"),

    /**
     * Specifies the atomic action of cleaning an object, such as a file system.
     * 
     */
    @XmlEnumValue("Clean")
    CLEAN("Clean"),

    /**
     * Specifies the atomic action of clicking an object, as with a mouse.
     * 
     */
    @XmlEnumValue("Click")
    CLICK("Click"),

    /**
     * Specifies the atomic action of closing an object, such as a window handle.
     * 
     */
    @XmlEnumValue("Close")
    CLOSE("Close"),

    /**
     * Specifies the atomic action of comparing two objects.
     * 
     */
    @XmlEnumValue("Compare")
    COMPARE("Compare"),

    /**
     * Specifies the atomic action of compressing an object.
     * 
     */
    @XmlEnumValue("Compress")
    COMPRESS("Compress"),

    /**
     * Specifies the atomic action of configuring a resource.
     * 
     */
    @XmlEnumValue("Configure")
    CONFIGURE("Configure"),

    /**
     * Specifies the atomic action of connecting to an object, such as a service or resource.
     * 
     */
    @XmlEnumValue("Connect")
    CONNECT("Connect"),

    /**
     * Specifies the atomic action of controlling an object or data.
     * 
     */
    @XmlEnumValue("Control")
    CONTROL("Control"),

    /**
     * Specifies the atomic action of copying or duplicating an object or data EXCEPT in cases where the object is considered a thread or process as a whole.
     * 
     */
    @XmlEnumValue("Copy/Duplicate")
    COPY_DUPLICATE("Copy/Duplicate"),

    /**
     * Specifies the atomic action of creating an object or data.
     * 
     */
    @XmlEnumValue("Create")
    CREATE("Create"),

    /**
     * Specifies the atomic action of decoding an object or data.
     * 
     */
    @XmlEnumValue("Decode")
    DECODE("Decode"),

    /**
     * Specifies the atomic action of decompressing an object, such as an archive.
     * 
     */
    @XmlEnumValue("Decompress")
    DECOMPRESS("Decompress"),

    /**
     * Specifies the atomic action of decrypting an object.
     * 
     */
    @XmlEnumValue("Decrypt")
    DECRYPT("Decrypt"),

    /**
     * Specifies the atomic action of denying access to a object or resource.
     * 
     */
    @XmlEnumValue("Deny")
    DENY("Deny"),

    /**
     * Specifies the atomic action of depressing an object that has been pressed, such a button.
     * 
     */
    @XmlEnumValue("Depress")
    DEPRESS("Depress"),

    /**
     * Specifies the atomic action of detecting an object.
     * 
     */
    @XmlEnumValue("Detect")
    DETECT("Detect"),

    /**
     * Specifies the atomic action of disconnecting from a service or resource.
     * 
     */
    @XmlEnumValue("Disconnect")
    DISCONNECT("Disconnect"),

    /**
     * Specifies the atomic action of downloading an object or data.
     * 
     */
    @XmlEnumValue("Download")
    DOWNLOAD("Download"),

    /**
     * Specifies the atomic action of drawing an object.
     * 
     */
    @XmlEnumValue("Draw")
    DRAW("Draw"),

    /**
     * Specifies the atomic action of dropping an object, such as a connection.
     * 
     */
    @XmlEnumValue("Drop")
    DROP("Drop"),

    /**
     * Specifies the atomic action of encoding an object or data.
     * 
     */
    @XmlEnumValue("Encode")
    ENCODE("Encode"),

    /**
     * Specifies the atomic action of encrypting an object or data.
     * 
     */
    @XmlEnumValue("Encrypt")
    ENCRYPT("Encrypt"),

    /**
     * Specifies the atomic action of enumerating a list of objects.
     * 
     */
    @XmlEnumValue("Enumerate")
    ENUMERATE("Enumerate"),

    /**
     * Specifies the atomic action of executing an object, such as an executable file.
     * 
     */
    @XmlEnumValue("Execute")
    EXECUTE("Execute"),

    /**
     * Specifies the atomic action of extracting an object.
     * 
     */
    @XmlEnumValue("Extract")
    EXTRACT("Extract"),

    /**
     * Specifies the atomic action of filtering an object or data.
     * 
     */
    @XmlEnumValue("Filter")
    FILTER("Filter"),

    /**
     * Specifies the atomic action of finding an object or data.
     * 
     */
    @XmlEnumValue("Find")
    FIND("Find"),

    /**
     * Specifies the atomic action of flushing an object or data, such as a cache.
     * 
     */
    @XmlEnumValue("Flush")
    FLUSH("Flush"),

    /**
     * Specifies the atomic action of forking, as with a process. Because this is usually associated with processes and threads and does not generalize to objects, it is DIFFERENT from Copy/Duplicate.
     * 
     */
    @XmlEnumValue("Fork")
    FORK("Fork"),

    /**
     * Specifies the atomic action of freeing an object.
     * 
     */
    @XmlEnumValue("Free")
    FREE("Free"),

    /**
     * Specifies the atomic action of getting a value from an object.
     * 
     */
    @XmlEnumValue("Get")
    GET("Get"),

    /**
     * Specifies the atomic action of hooking an object to another object.
     * 
     */
    @XmlEnumValue("Hook")
    HOOK("Hook"),

    /**
     * Specifies the atomic action of hiding an object.
     * 
     */
    @XmlEnumValue("Hide")
    HIDE("Hide"),

    /**
     * Specifies the atomic action of impersonation, in which an object performs actions that assume the character or appearance of another object.
     * 
     */
    @XmlEnumValue("Impersonate")
    IMPERSONATE("Impersonate"),

    /**
     * Specifies the atomic action of initializing an object.
     * 
     */
    @XmlEnumValue("Initialize")
    INITIALIZE("Initialize"),

    /**
     * Specifies the atomic action of injecting an object.
     * 
     */
    @XmlEnumValue("Inject")
    INJECT("Inject"),

    /**
     * Specifies the atomic action of installing an object, such as an application, program, patch, or other resource.
     * 
     */
    @XmlEnumValue("Install")
    INSTALL("Install"),

    /**
     * Specifies the atomic action of interleaving an object, i.e. the action of arranging data in a non-contiguous way to increase performance.
     * 
     */
    @XmlEnumValue("Interleave")
    INTERLEAVE("Interleave"),

    /**
     * Specifies the atomic action of joining one object to another object.
     * 
     */
    @XmlEnumValue("Join")
    JOIN("Join"),

    /**
     * Specifies the atomic action of killing an object, as with a thread or program.
     * 
     */
    @XmlEnumValue("Kill")
    KILL("Kill"),

    /**
     * Specifies the atomic action of listening to an object, such as to a port on a network connection.
     * 
     */
    @XmlEnumValue("Listen")
    LISTEN("Listen"),

    /**
     * Specifies the atomic action of loading an object.
     * 
     */
    @XmlEnumValue("Load")
    LOAD("Load"),

    /**
     * Specifies the atomic action of locking an object.
     * 
     */
    @XmlEnumValue("Lock")
    LOCK("Lock"),

    /**
     * Specifies the atomic action of logging into an object, such as into a system or application.
     * 
     */
    @XmlEnumValue("Login/Logon")
    LOGIN_LOGON("Login/Logon"),

    /**
     * Specifies the atomic action of logging out of an object, such as a system or application.
     * 
     */
    @XmlEnumValue("Logout/Logoff")
    LOGOUT_LOGOFF("Logout/Logoff"),

    /**
     * Specifies the atomic action of mapping an object to another object or data.
     * 
     */
    @XmlEnumValue("Map")
    MAP("Map"),

    /**
     * Specifies the atomic action of merging one object to another object.
     * 
     */
    @XmlEnumValue("Merge")
    MERGE("Merge"),

    /**
     * Specifies the atomic action of modifying an object.
     * 
     */
    @XmlEnumValue("Modify")
    MODIFY("Modify"),

    /**
     * Specifies the atomic action of monitoring the state of an object.
     * 
     */
    @XmlEnumValue("Monitor")
    MONITOR("Monitor"),

    /**
     * Specifies the atomic action of moving an object.
     * 
     */
    @XmlEnumValue("Move")
    MOVE("Move"),

    /**
     * Specifies the atomic action of opening an object.
     * 
     */
    @XmlEnumValue("Open")
    OPEN("Open"),

    /**
     * Specifies the atomic action of packing an object.
     * 
     */
    @XmlEnumValue("Pack")
    PACK("Pack"),

    /**
     * Specifies the atomic action of pausing an object, such as a thread or process.
     * 
     */
    @XmlEnumValue("Pause")
    PAUSE("Pause"),

    /**
     * Specifies the atomic action of pressing an object, such as a button.
     * 
     */
    @XmlEnumValue("Press")
    PRESS("Press"),

    /**
     * Specifies the atomic action of protecting an object.
     * 
     */
    @XmlEnumValue("Protect")
    PROTECT("Protect"),

    /**
     * Specifies the atomic action of placing an object in quarantine, that is, to store the object in an isolated area away from other objects it can operate on.
     * 
     */
    @XmlEnumValue("Quarantine")
    QUARANTINE("Quarantine"),

    /**
     * Specifies the atomic action of querying an object.
     * 
     */
    @XmlEnumValue("Query")
    QUERY("Query"),

    /**
     * Specifies the atomic action of queueing an object.
     * 
     */
    @XmlEnumValue("Queue")
    QUEUE("Queue"),

    /**
     * Specifies the atomic action of raising an object.
     * 
     */
    @XmlEnumValue("Raise")
    RAISE("Raise"),

    /**
     * Specifies the atomic action of reading an object.
     * 
     */
    @XmlEnumValue("Read")
    READ("Read"),

    /**
     * Specifies the atomic action of receiving an object.
     * 
     */
    @XmlEnumValue("Receive")
    RECEIVE("Receive"),

    /**
     * Specifies the atomic action of releasing an object.
     * 
     */
    @XmlEnumValue("Release")
    RELEASE("Release"),

    /**
     * Specifies the atomic action of renaming an object.
     * 
     */
    @XmlEnumValue("Rename")
    RENAME("Rename"),

    /**
     * Specifies the atomic action of removing or deleting an object.
     * 
     */
    @XmlEnumValue("Remove/Delete")
    REMOVE_DELETE("Remove/Delete"),

    /**
     * Specifies the atomic action of replicating an object.
     * 
     */
    @XmlEnumValue("Replicate")
    REPLICATE("Replicate"),

    /**
     * Specifies the atomic action of restoring an object.
     * 
     */
    @XmlEnumValue("Restore")
    RESTORE("Restore"),

    /**
     * Specifies the atomic action of resuming an object, as with a process or thread.
     * 
     */
    @XmlEnumValue("Resume")
    RESUME("Resume"),

    /**
     * Specifies the atomic action of reverting an object.
     * 
     */
    @XmlEnumValue("Revert")
    REVERT("Revert"),

    /**
     * Specifies the atomic action of running an object, such as an application.
     * 
     */
    @XmlEnumValue("Run")
    RUN("Run"),

    /**
     * Specifies the atomic action of saving an object.
     * 
     */
    @XmlEnumValue("Save")
    SAVE("Save"),

    /**
     * Specifies the atomic action of scanning for an object or data.
     * 
     */
    @XmlEnumValue("Scan")
    SCAN("Scan"),

    /**
     * Specifies the atomic action of scheduling an object, such as an event.
     * 
     */
    @XmlEnumValue("Schedule")
    SCHEDULE("Schedule"),

    /**
     * Specifies the atomic action of searching for an object.
     * 
     */
    @XmlEnumValue("Search")
    SEARCH("Search"),

    /**
     * Specifies the atomic action of sending an object.
     * 
     */
    @XmlEnumValue("Send")
    SEND("Send"),

    /**
     * Specifies the atomic action of setting an object to a value.
     * 
     */
    @XmlEnumValue("Set")
    SET("Set"),

    /**
     * Specifies the atomic action of shutting down an object.
     * 
     */
    @XmlEnumValue("Shutdown")
    SHUTDOWN("Shutdown"),

    /**
     * Specifies the atomic action of putting to sleep an object.
     * 
     */
    @XmlEnumValue("Sleep")
    SLEEP("Sleep"),

    /**
     * Specifies the atomic action taking a snapshot of an object.
     * 
     */
    @XmlEnumValue("Snapshot")
    SNAPSHOT("Snapshot"),

    /**
     * Specifies the atomic action of starting an object, such as a thread or process.
     * 
     */
    @XmlEnumValue("Start")
    START("Start"),

    /**
     * Specifies the atomic action of stopping an object, such as a thread or process.
     * 
     */
    @XmlEnumValue("Stop")
    STOP("Stop"),

    /**
     * Specifies the atomic action of suspending an object, such an account or privileges for an account.
     * 
     */
    @XmlEnumValue("Suspend")
    SUSPEND("Suspend"),

    /**
     * Specifies the atomic action of synchronizing an object.
     * 
     */
    @XmlEnumValue("Synchronize")
    SYNCHRONIZE("Synchronize"),

    /**
     * Specifies the atomic action of throwing an object, such as an exception in a programming language.
     * 
     */
    @XmlEnumValue("Throw")
    THROW("Throw"),

    /**
     * Specifies the atomic action of transmitting an object.
     * 
     */
    @XmlEnumValue("Transmit")
    TRANSMIT("Transmit"),

    /**
     * Specifies the atomic action of unblocking an object.
     * 
     */
    @XmlEnumValue("Unblock")
    UNBLOCK("Unblock"),

    /**
     * Specifies the atomic action of unhiding an object.
     * 
     */
    @XmlEnumValue("Unhide")
    UNHIDE("Unhide"),

    /**
     * Specifies the atomic action of unhooking an object from another object, that is, to detach.
     * 
     */
    @XmlEnumValue("Unhook")
    UNHOOK("Unhook"),

    /**
     * Specifies the atomic action of uninstalling an object.
     * 
     */
    @XmlEnumValue("Uninstall")
    UNINSTALL("Uninstall"),

    /**
     * Specifies the atomic action of unloading an object.
     * 
     */
    @XmlEnumValue("Unload")
    UNLOAD("Unload"),

    /**
     * Specifies the atomic action of unlocking an object.
     * 
     */
    @XmlEnumValue("Unlock")
    UNLOCK("Unlock"),

    /**
     * Specifies the atomic action of unmapping an object from another object or data.
     * 
     */
    @XmlEnumValue("Unmap")
    UNMAP("Unmap"),

    /**
     * Specifies the atomic action of unpacking an object, such as an archive.
     * 
     */
    @XmlEnumValue("Unpack")
    UNPACK("Unpack"),

    /**
     * Specifies the atomic action of updating an object.
     * 
     */
    @XmlEnumValue("Update")
    UPDATE("Update"),

    /**
     * Specifies the atomic action of upgrading an object.
     * 
     */
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade"),

    /**
     * Specifies the atomic action of uploading an object.
     * 
     */
    @XmlEnumValue("Upload")
    UPLOAD("Upload"),

    /**
     * Specifies the atomic action of wiping, destroying, or purging an object.
     * 
     */
    @XmlEnumValue("Wipe/Destroy/Purge")
    WIPE_DESTROY_PURGE("Wipe/Destroy/Purge"),

    /**
     * Specifies the atomic action of writing an object.
     * 
     */
    @XmlEnumValue("Write")
    WRITE("Write");
    private final String value;

    ActionTypeEnum10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionTypeEnum10 fromValue(String v) {
        for (ActionTypeEnum10 c: ActionTypeEnum10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
