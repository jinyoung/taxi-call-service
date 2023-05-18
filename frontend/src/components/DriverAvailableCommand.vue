<template>

    <v-card outlined>
        <v-card-title>
            DriverAvailable
        </v-card-title>

        <v-card-text>
            <String label="CurrentLocation" v-model="value.currentLocation" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="driverAvailable"
            >
                DriverAvailable
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DriverAvailableCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.currentLocation = '';
        },
        watch: {
        },
        methods: {
            driverAvailable() {
                this.$emit('driverAvailable', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

